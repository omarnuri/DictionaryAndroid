import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import android.widget.LinearLayout
import androidx.core.content.ContextCompat
import com.omarnuri.dictionary.R

public enum class Difficulty {
    HARD,
    MEDIUM,
    EASY
}

public class Word(val word: String, val translation: String, val difficulty: Difficulty)

class CustomListAdapter(context: Context, private val wordList: List<Word>) :
    ArrayAdapter<Word>(context, 0, wordList) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var itemView = convertView
        if (itemView == null) {
            itemView = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false)
        }

        val word = wordList[position]

        val wordText = itemView?.findViewById<TextView>(R.id.word_text)
        val translationText = itemView?.findViewById<TextView>(R.id.translation_text)
        val difficultyLayout = itemView?.findViewById<LinearLayout>(R.id.difficulty_layout)
        val redCircle = itemView?.findViewById<View>(R.id.red_circle)
        val yellowCircle = itemView?.findViewById<View>(R.id.yellow_circle)
        val greenCircle = itemView?.findViewById<View>(R.id.green_circle)

        wordText?.text = word.word
        translationText?.text = word.translation

        when (word.difficulty) {
            Difficulty.HARD -> {
                redCircle?.visibility = View.VISIBLE
                yellowCircle?.visibility = View.INVISIBLE
                greenCircle?.visibility = View.INVISIBLE
            }
            Difficulty.MEDIUM -> {
                redCircle?.visibility = View.INVISIBLE
                yellowCircle?.visibility = View.VISIBLE
                greenCircle?.visibility = View.INVISIBLE
            }
            Difficulty.EASY -> {
                redCircle?.visibility = View.INVISIBLE
                yellowCircle?.visibility = View.INVISIBLE
                greenCircle?.visibility = View.VISIBLE
            }
        }

        return itemView!!
    }

    override fun getCount(): Int {
        return wordList.size
    }
}
