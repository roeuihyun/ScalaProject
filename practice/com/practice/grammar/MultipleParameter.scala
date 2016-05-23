package com.practice.grammar

/**
	*
	*/
class MultipleParameter {

	def capitalizeAll(args: String*)={
		args.map { arg =>arg.capitalize	}
	}

}