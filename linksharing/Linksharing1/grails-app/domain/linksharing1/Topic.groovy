package linksharing1

class Topic {
enum Visibility 
{
PUBLIC, PRIVATE
}


	String name
	Date datecreated
	User createdBy
	Date lastupdated
	Visibility visibility
	static belongsTo=[user:User]
static hasMany= [resource: Resource, subscription:Subscription]
//static hasMany= [subscription:Subscription]
    static constraints = {
visibility blank:false
    }
}
