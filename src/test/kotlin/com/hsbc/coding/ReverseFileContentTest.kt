package com.hsbc.coding

import com.hsbc.coding.util.FileProcessor
import org.mockito.Mockito.mock
import org.mockito.Mockito.verify
import org.mockito.kotlin.any
import org.mockito.kotlin.whenever
import kotlin.test.Test

class ReverseFileContentTest {

    @Test
    fun testOutputFileContent() {
        val inputContent = "ABC"
        val expectedOutputContent = "CBA"

        val mockFileProcessor = mock<FileProcessor>()

        // Configure mock behavior
        whenever(mockFileProcessor.readFile(any())).thenReturn(inputContent)

        val fileContentReverser = FileContentReverser(mockFileProcessor)
        fileContentReverser.reverseFileContent("input.txt", "output.txt")

        // Verify interactions and expected output
        verify(mockFileProcessor).readFile("input.txt")
        verify(mockFileProcessor).writeFile("output.txt", expectedOutputContent)
    }
}