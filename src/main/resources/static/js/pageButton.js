// 현재 페이지를 저장할 변수
var currentPage = 1;
// 페이지당 행 수
var rowsPerPage = 10;

// 페이지를 변경하는 함수
function changePage(pageNumber) {
    // 현재 페이지를 설정
    currentPage = pageNumber;
    // 모든 행을 숨김
    hideAllRows();
    // 현재 페이지에 해당하는 행들을 보여줌
    showRowsForCurrentPage();
}

// 모든 행을 숨기는 함수
function hideAllRows() {
    var rows = document.querySelectorAll('[id^="row_"]');
    rows.forEach(function(row) {
        row.style.display = 'none';
    });
}

// 현재 페이지에 해당하는 행들을 보여주는 함수
function showRowsForCurrentPage() {
    var startIndex = (currentPage - 1) * rowsPerPage;
    var endIndex = startIndex + rowsPerPage;
    var rows = document.querySelectorAll('[id^="row_"]');
    for (var i = startIndex; i < endIndex && i < rows.length; i++) {
        rows[i].style.display = 'table-row';
    }
}

// 초기 페이지 로드 시 첫 번째 페이지 행들을 보여줌
window.onload = function() {
    changePage(1);
};
