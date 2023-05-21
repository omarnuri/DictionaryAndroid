package com.omarnuri.dictionary
import CustomListAdapter
import Word
import com.omarnuri.dictionary.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Создание списка слов
        val wordList = mutableListOf<Word>()
        wordList.add(Word("Hello", "Привет", Difficulty.HARD))
        wordList.add(Word("Goodbye", "До свидания", Difficulty.MEDIUM))
        wordList.add(Word("Thank you", "Спасибо", Difficulty.EASY))
        wordList.add(Word("Hello", "Привет", Difficulty.HARD))
        wordList.add(Word("Goodbye", "До свидания", Difficulty.MEDIUM))
        wordList.add(Word("Thank you", "Спасибо", Difficulty.EASY))
        wordList.add(Word("Hello", "Привет", Difficulty.HARD))
        wordList.add(Word("Goodbye", "До свидания", Difficulty.MEDIUM))
        wordList.add(Word("Thank you", "Спасибо", Difficulty.EASY))
        wordList.add(Word("Hello", "Привет", Difficulty.HARD))
        wordList.add(Word("Goodbye", "До свидания", Difficulty.MEDIUM))
        wordList.add(Word("Thank you", "Спасибо", Difficulty.EASY))
        wordList.add(Word("Hello", "Привет", Difficulty.HARD))
        wordList.add(Word("Goodbye", "До свидания", Difficulty.MEDIUM))
        wordList.add(Word("Thank you", "Спасибо", Difficulty.EASY))

// Создание адаптера и установка его в ListView
        val adapter = CustomListAdapter(this, wordList)
        val listView = findViewById<ListView>(R.id.word_list)
        listView.adapter = adapter

    }
}