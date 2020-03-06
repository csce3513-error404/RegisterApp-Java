document.addEventListener("DOMContentLoaded", () => {
    document.getElementById("strtrans").addEventListener("click", Display);
    document.getElementById("salesreport").addEventListener("click", Display);
    document.getElementById("cashreport").addEventListener("click", Display);

    document.getElementById("viewproduct").addEventListener("click", Productlist);
    document.getElementById("createemployee").addEventListener("click", Employeedetials);

    document.getElementById("signout").addEventListener("click", Signout);

});


function Display(event)
{
    alert("functionality has not yet been implemented");
}

function Productlist(event)
{
	windows.location.assign("productDetail");
}

function Employeedetials(event)
{
	windows.location.assign("employeeDetail");
}

function Signout()
{
			document.getElementById("test").innerHTML = "signed out"; 
            windows.location.replace("signInView");
            
            xhttp.open("GET", "ajaxDelete()", true);
            xhttp.send();
}