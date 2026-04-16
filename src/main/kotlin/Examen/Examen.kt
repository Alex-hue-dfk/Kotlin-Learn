package Examen

import kotlinx.serialization.json.Json
import java.io.File
import java.nio.file.Path

fun countLines(filePath: String): Int = File(filePath).useLines { it.count() }

fun maim(){
    val filePath = "C:\\Users\\user\\Desktop\\Новая папка (12)\\Kotlin_Graphs_And_Events-main"
    val lineCount = countLines(filePath)

    val result = Json.encodeToString(mapOf("filename" to filePath, "lines" to lineCount))

}