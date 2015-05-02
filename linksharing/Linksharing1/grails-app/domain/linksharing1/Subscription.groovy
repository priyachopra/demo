package linksharing1

class Subscription {
enum Seriousness
{
SERIOUS, VERYSERIOUS, CASUAL
}

Date datecreated
Seriousness seriousness
static belongsTo=[user:User, topic:Topic]
//static belongsTo=[topic:Topic]

    static constraints = {
seriousness blank:false
    }
}
