package org.ice1000.gradle

import org.gradle.api.tasks.Exec
import java.nio.file.Paths

/**
 * @author ice1000
 */
open class GenNativeHeaderTask : Exec() {
	val target = Paths.get("jni", "javah").toAbsolutePath().toString()
	val classpath = project.buildDir.absoluteFile.resolve("classes").resolve("java").resolve("main")

	init {
		group = "code generation"
		description = "Run javah to generate all native header files"
	}

	fun classes(vararg classes: String) {
		commandLine("javah", "-d", target, "-classpath", classpath, *classes)
	}
}