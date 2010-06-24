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

Activity CounterActivity 
	action inc button 
	action dec button
	
Activity MasterActivity launchable 
	callActivity CounterActivity button
	
Application TwoActivity 
	avd 7 
	package it.unibo.android.twoActivity 
	entryActiviy MasterActivity 
	target 6 
	path TwoActivity