
    // 페이지 로드 시 실행되는 함수
    window.onload = function() {
    // 모든 리스트 요소를 가져옵니다.
    var listItems = document.querySelectorAll('.chart tbody tr');

    // 각 리스트 요소에 대해 반복문을 실행합니다.
    listItems.forEach(function(listItem, index) {
    // 각 리스트 요소에 클릭 이벤트를 추가합니다.
    listItem.addEventListener('click', function() {
    // 클릭된 리스트 요소의 인덱스에 따라서 '/subpage/profile'로 이동합니다.
    switch (index) {
    case 1:
    window.location.href = '/subpage/edoc_form_ct_vacation';
    break;
    case 2:
    window.location.href = '/subpage/edoc_form_ct_draft';
    break;
    case 3:
    window.location.href = '/subpage/edoc_form_ct_closing';
    break;
    case 4:
    window.location.href = '/subpage/edoc_form_ct_meeting';
    break;
    // 이 외의 경우에는 아무 작업도 하지 않습니다.
    default:
    break;
}
});
});
};
