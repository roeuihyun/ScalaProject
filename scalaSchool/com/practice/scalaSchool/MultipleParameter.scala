package com.practice.scalaSchool

/**
	*
	*/
class MultipleParameter {

	def capitalizeAll(args: String*)={
		args.map { arg =>arg.capitalize	}
	}

}