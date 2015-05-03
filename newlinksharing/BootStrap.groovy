import linksharing1.User
class BootStrap {

    def init = { servletContext ->
if(!User.count())
{
new User( email:"deepti@gmail.com" ,
	username:"deepti" ,
	password:"dee" ,
	confirmpassword:"dee" ,
	fname:"deepti" ,
	 lname:"bhardwaj" ,
	 admin: true, 
	actor: true
	

).save(failOnError: true)
    }}
    def destroy = {
    }
}



