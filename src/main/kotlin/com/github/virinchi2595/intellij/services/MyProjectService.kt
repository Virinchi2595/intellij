package com.github.virinchi2595.intellij.services

import com.intellij.openapi.project.Project
import com.github.virinchi2595.intellij.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
