package de.mariushoefler.flutter_enhancement_suite.livetemplates.flutter

import com.intellij.codeInsight.template.impl.DefaultLiveTemplatesProvider

class FlutterTemplateProvider : DefaultLiveTemplatesProvider {

	override fun getDefaultLiveTemplateFiles(): Array<String> {
		return arrayOf("liveTemplates/Flutter")
	}

	override fun getHiddenLiveTemplateFiles(): Array<String>? {
		return arrayOf()
	}
}
