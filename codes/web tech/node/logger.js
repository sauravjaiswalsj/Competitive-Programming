const EventEmitter = require('events');
const emitter = new EventEmitter();

function log(message)	{
//send request
	console.log(message);

	//Raise an event
	emitter.emit('messageLogged', {id: 1, url:'https://'});
}

module.exports = log;
