package com.github.l1l1l1l.zhaoqingtao.services

import com.github.l1l1l1l.zhaoqingtao.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
