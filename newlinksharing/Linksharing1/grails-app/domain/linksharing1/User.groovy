package linksharing1

class User {
	String email
	String username
	String password
	String confirmpassword
	String fname
	String lname
	Byte photo
	Boolean admin
	Boolean actor
	Date datecreated
	Date lastupdated
	
	static hasMany=[topic:Topic,resource:Resource, subscription: Subscription, readingitem:ReadingItem,resourcerating:ResourceRating]

//static hasMany=[resource:Resource]
    static constraints = {
photo (nullable: true)
email(email:true, blank:false, nullable:false, unique:true)
password(password: true, blank:false, nullable: false, validator: {password, confirmpassword, obj ->
if(password == confirmpassword)
return true 
else
return false
})
    }
}
