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
	
	static hasMany=[topic:Topic,resource:Resource]
static hasOne=[subscription: Subscription]
//static hasMany=[resource:Resource]
    static constraints = {
email(email:true, blank:false, nullable:false, unique:true)

    }
}
