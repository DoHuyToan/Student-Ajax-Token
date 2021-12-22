function login1(){
    let username = $('#username').val();
    let password = $('#password').val();
    let data = {
        username: username,
        password: password
    }
    $.ajax({
        url: "http://localhost:8080/api/login",
        type: 'POST',
        headers:{
            "Accept": "application/json",
            "Content-type": "application/json"
        },
        data:JSON.stringify(data),
        success: function (student){

            localStorage.setItem("student", JSON.stringify(student))
            window.location.href ="list.html"

        }
    })
    event.defaultPrevented
}
