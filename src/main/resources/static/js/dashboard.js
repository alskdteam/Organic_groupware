

    let startDate = new Date(); // 현재 날짜를 시작 날짜로 설정

    function formatDate(date) {
    const year = date.getFullYear();
    const month = String(date.getMonth() + 1).padStart(2, '0');
    const day = String(date.getDate()).padStart(2, '0');
    return `${year}-${month}-${day}`;
}

    function updateCalendar() {
    const weekLabel = document.getElementById("week-label");
    const startOfWeek = new Date(startDate); // 현재 시작 날짜를 가져옴

    const daysOfWeek = ['Sun', 'Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat'];

    for (let i = 0; i < 7; i++) {
    const currentDate = new Date(startOfWeek);
    currentDate.setDate(currentDate.getDate() + i);

    const dayIndex = (startOfWeek.getDay() + i) % 7; // Corrected day index
    const day = daysOfWeek[dayIndex];
    const cellShift = document.getElementById(`shift-${day}`);
    const cellVehicle = document.getElementById(`vehicle-${day}`);
    const cellItem = document.getElementById(`item-${day}`);

    const dateSpanShift = cellShift.querySelector(".hidden-date");
    const dateSpanVehicle = cellVehicle.querySelector(".hidden-date");
    const dateSpanItem = cellItem.querySelector(".hidden-date");

    dateSpanShift.textContent = formatDate(currentDate);
    dateSpanVehicle.textContent = formatDate(currentDate);
    dateSpanItem.textContent = formatDate(currentDate);
}

    const endOfWeek = new Date(startOfWeek);
    endOfWeek.setDate(endOfWeek.getDate() + 6);

    const startMonth = startOfWeek.getMonth() + 1;
    const endMonth = endOfWeek.getMonth() + 1;
    const startDay = startOfWeek.getDate();
    const endDay = endOfWeek.getDate();

    if (startMonth === endMonth) {
    weekLabel.textContent = `${startMonth}월 ${startDay}일 ~ ${endDay}일`;
} else {
    weekLabel.textContent = `${startMonth}월 ${startDay}일 ~ ${endMonth}월 ${endDay}일`;
}
}

    function prevWeek() {
    startDate.setDate(startDate.getDate() - 7); // 이전 주간으로 이동
    sendDatesToController(); // 캘린더 업데이트와 동시에 날짜를 서버로 전송
    updateCalendar(); // 캘린더 업데이트
}

    function nextWeek() {
    startDate.setDate(startDate.getDate() + 7); // 다음 주간으로 이동
    sendDatesToController(); // 캘린더 업데이트와 동시에 날짜를 서버로 전송
    updateCalendar(); // 캘린더 업데이트
}

    function sendDatesToController() {
    const daysOfWeek = ['Sun', 'Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat'];

    for (let i = 0; i < 7; i++) {
    const currentDate = new Date(startDate);
    currentDate.setDate(currentDate.getDate() + i);

    const dayIndex = (startDate.getDay() + i) % 7;
    const day = daysOfWeek[dayIndex];
    const formattedDate = formatDate(currentDate);

    // 서버로 날짜 전송
    sendDateToController(day, formattedDate);
}
}
    // 페이지가 로드될 때 실행되는 함수
    document.addEventListener("DOMContentLoaded", function() {
    // 현재 날짜와 요일을 구하여 sendDateToController 함수에 전달합니다.
    const currentDate = new Date();
    const daysOfWeek = ['Sun', 'Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat'];

    // 7일 동안 반복하여 각 날짜를 전달합니다.
    for (let i = 0; i < 7; i++) {
    const targetDate = new Date(currentDate.getTime() + i * 24 * 60 * 60 * 1000);
    const dayIndex = targetDate.getDay();
    const day = daysOfWeek[dayIndex];
    const formattedDate = formatDate(targetDate);

    // sendDateToController 함수 호출
    sendDateToController(day, formattedDate);
}
});

    function sendDateToController(day, formattedDate) {
    fetch('/login/dashboard', {
        method: 'post',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify({ day: day, date: formattedDate })
    })
        .then(response => {
            console.log('날짜 전송 완료:', formattedDate);
        })
        .catch(error => {
            console.error('날짜 전송 실패:', error);
        });
}

    updateCalendar();