package com.practice.grammar

/**
	*
	*/
object MultipleParameter {

	def capitalizeAll(args: String*) = {
		args.map { arg =>
			arg.capitalize
		}
	}

}