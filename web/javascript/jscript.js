function check() {
    var username = document.forms["main"]["username"].value;
    if (username == "") {
        alert('Enter User Name');
    }

    var password = document.forms["main"]["password"].value;
    if (password == "") {
        alert('Enter PassWord');
    }

}

function checksignup() {
    var username = document.forms["mainsup"]["username"].value;
    var email = document.forms["mainsup"]["email"].value;
    var password = document.forms["mainsup"]["password"].value;
    var repassword = document.forms["mainsup"]["repassword"].value;
    if (username == "" || email == "" || password == "" || repassword == "") {
        alert('enter valid detail');
    } else {
        if (username == "") {
            alert('Enter User Name');
        }

        if (email == "") {
            alert('Enter Email Id');
        }

        if (password == "") {
            alert('Enter PassWord');
        }

        if (repassword == "") {
            alert('Enter PassWord');
        }

        if (password != repassword) {
            alert('PassWord Not Match');
        }
    }
}
