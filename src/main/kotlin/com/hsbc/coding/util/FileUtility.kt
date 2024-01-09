package com.hsbc.coding.util

import java.io.File

class FileProcessorImpl : FileProcessor {

    override fun readFile(path: String): String {
        return File(path).readText(Charsets.US_ASCII)
    }

    override fun writeFile(path: String, content: String) {
        File(path).writeText(content, Charsets.US_ASCII)
    }
}

interface FileProcessor {
    fun readFile(path: String): String
    fun writeFile(path: String, content: String)
}
