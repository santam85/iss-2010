AndroidSystem sys

data uniboMsg 
	scheme "msgContent" 
	host "it.unibo.msg"
	
action inc 
	data uniboMsg 
	category "android.intent.category.DEFAULT"
	
action dec 
	data uniboMsg
	category "android.intent.category.DEFAULT"
	
Activity 
	CounterActivity launchable 
	action inc button 
	action dec button
	
Application BasicActivity 
	avd 7 
	package it.unibo.android.basicActivity 
	entryActiviy CounterActivity 
	target 6 
	path BasicActivity
