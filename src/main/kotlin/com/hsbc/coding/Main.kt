package com.hsbc.coding

import com.hsbc.coding.util.FileProcessor
import com.hsbc.coding.util.FileProcessorImpl

const val INPUT_FILE_PATH = "src/main/resources/input.txt"
const val OUTPUT_FILE_PATH = "src/main/resources/output.txt"

fun main() {
    FileContentReverser(FileProcessorImpl())
        .reverseFileContent(inputPath = INPUT_FILE_PATH, outputPath = OUTPUT_FILE_PATH)
}

/**
 * Class to reverse the input file content
 */
class FileContentReverser(
    private val fileProcessor: FileProcessor
) {
    /**
     * Function to read input file and reverse the input content to output file
     * @param inputPath input file path
     * @param outputPath output file path
     */
    fun reverseFileContent(inputPath: String, outputPath: String) {
        val inputContent = fileProcessor.readFile(inputPath)
        // Reverse content of input file and write to new file...
        fileProcessor.writeFile(outputPath, inputContent.reversed())
    }
}