package com.example.android.bunnyquizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;


/*
 *Initialize content to improve performance
 *Credit - Slack mentor suggested for me to do this
 *https://discussions.udacity.com/t/share-your-project-mentor-feedback/508399/5673
 */
public class MainActivity extends AppCompatActivity {
    ScrollView topLayout;
    LinearLayout mainLayout;
    ImageView headerImageView;
    TextView headerTextView;
    TextView subheaderTextView;
    TextView q1TextView;
    ImageView q1ImageView;
    RadioGroup q1RadioGroup;
    RadioButton q1aRadioButton;
    RadioButton q1bRadioButton;
    RadioButton q1cRadioButton;
    RadioButton q1dRadioButton;
    TextView q2TextView;
    ImageView q2ImageView;
    EditText q2Answer;
    TextView q3TextView;
    ImageView q3ImageView;
    RadioGroup q3RadioGroup;
    RadioButton q3aRadioButton;
    RadioButton q3bRadioButton;
    RadioButton q3cRadioButton;
    RadioButton q3dRadioButton;
    TextView q4TextView;
    ImageView q4ImageView;
    LinearLayout q4Checkboxes;
    CheckBox q4aCheckboxes;
    CheckBox q4bCheckboxes;
    CheckBox q4cCheckboxes;
    CheckBox q4dCheckboxes;
    TextView q5TextView;
    ImageView q5ImageView;
    RadioGroup q5RadioGroup;
    RadioButton q5aRadioButton;
    RadioButton q5bRadioButton;
    TextView q6TextView;
    ImageView q6ImageView;
    RadioGroup q6RadioGroup;
    RadioButton q6aRadioButton;
    RadioButton q6bRadioButton;
    RadioButton q6cRadioButton;
    RadioButton q6dRadioButton;
    TextView q7TextView;
    ImageView q7ImageView;
    EditText q7Answer;
    TextView q8TextView;
    ImageView q8ImageView;
    RadioGroup q8RadioGroup;
    RadioButton q8aRadioButton;
    RadioButton q8bRadioButton;
    RadioButton q8cRadioButton;
    RadioButton q8dRadioButton;
    TextView q9TextView;
    ImageView q9ImageView;
    RadioGroup q9RadioGroup;
    RadioButton q9aRadioButton;
    RadioButton q9bRadioButton;
    TextView q10TextView;
    ImageView q10ImageView;
    RadioGroup q10RadioGroup;
    RadioButton q10aRadioButton;
    RadioButton q10bRadioButton;
    RadioButton q10cRadioButton;
    RadioButton q10dRadioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        topLayout = findViewById(R.id.scroll_view);
        mainLayout = findViewById(R.id.main_layout);
        headerImageView = findViewById(R.id.headerImage);
        headerTextView = findViewById(R.id.header);
        subheaderTextView = findViewById(R.id.subheader);
        q1TextView = findViewById(R.id.question1text);
        q1ImageView = findViewById(R.id.imageQ1);
        q1RadioGroup = findViewById(R.id.radioQ1);
        q1aRadioButton = findViewById(R.id.radio1a);
        q1bRadioButton = findViewById(R.id.radio1b);
        q1cRadioButton = findViewById(R.id.radio1c);
        q1dRadioButton = findViewById(R.id.radio1d);
        q2TextView = findViewById(R.id.question2text);
        q2ImageView = findViewById(R.id.imageQ2);
        q2Answer = findViewById(R.id.question2answer);
        q3TextView = findViewById(R.id.question3text);
        q3ImageView = findViewById(R.id.imageQ3);
        q3RadioGroup = findViewById(R.id.radioQ3);
        q3aRadioButton = findViewById(R.id.radio3a);
        q3bRadioButton = findViewById(R.id.radio3b);
        q3cRadioButton = findViewById(R.id.radio3c);
        q3dRadioButton = findViewById(R.id.radio3d);
        q4TextView = findViewById(R.id.question4text);
        q4ImageView = findViewById(R.id.imageQ4);
        q4Checkboxes = findViewById(R.id.q4LinearLayout);
        q4aCheckboxes = findViewById(R.id.checkbox4a);
        q4bCheckboxes = findViewById(R.id.checkbox4b);
        q4cCheckboxes = findViewById(R.id.checkbox4c);
        q4dCheckboxes = findViewById(R.id.checkbox4d);
        q5TextView = findViewById(R.id.question5text);
        q5ImageView = findViewById(R.id.imageQ5);
        q5RadioGroup = findViewById(R.id.radioQ5);
        q5aRadioButton = findViewById(R.id.radio5a);
        q5bRadioButton = findViewById(R.id.radio5b);
        q6TextView = findViewById(R.id.question6text);
        q6ImageView = findViewById(R.id.imageQ6);
        q6RadioGroup = findViewById(R.id.radioQ6);
        q6aRadioButton = findViewById(R.id.radio6a);
        q6bRadioButton = findViewById(R.id.radio6b);
        q6cRadioButton = findViewById(R.id.radio6c);
        q6dRadioButton = findViewById(R.id.radio6d);
        q7TextView = findViewById(R.id.question7text);
        q7ImageView = findViewById(R.id.imageQ7);
        q7Answer = findViewById(R.id.question7answer);
        q8TextView = findViewById(R.id.question8text);
        q8ImageView = findViewById(R.id.imageQ8);
        q8RadioGroup = findViewById(R.id.radioQ8);
        q8aRadioButton = findViewById(R.id.radio8a);
        q8bRadioButton = findViewById(R.id.radio8b);
        q8cRadioButton = findViewById(R.id.radio8c);
        q8dRadioButton = findViewById(R.id.radio8d);
        q9TextView = findViewById(R.id.question9text);
        q9ImageView = findViewById(R.id.imageQ9);
        q9RadioGroup = findViewById(R.id.radioQ9);
        q9aRadioButton = findViewById(R.id.radio9a);
        q9bRadioButton = findViewById(R.id.radio9b);
        q10TextView = findViewById(R.id.question10text);
        q10ImageView = findViewById(R.id.imageQ10);
        q10RadioGroup = findViewById(R.id.radioQ10);
        q10aRadioButton = findViewById(R.id.radio10a);
        q10bRadioButton = findViewById(R.id.radio10b);
        q10cRadioButton = findViewById(R.id.radio10c);
        q10dRadioButton = findViewById(R.id.radio10d);
    }

    /**
     * Calculate points when submit button is clicked
     */
    public void calculateScore(View v) {
        int points = 0;
        String wrongAnswer = "";
        /*
         * Question 1 - Correct Answer is Radio Button 2 - Lagomorphs
         * Credit - found code examples here:
         * https://stackoverflow.com/questions/11050074/how-to-check-if-radiobutton-is-checked
         */
        RadioButton radioButtonQ1b = findViewById(R.id.radio1b);
        if (radioButtonQ1b.isChecked()) {
            points++;
        }
        else
            wrongAnswer += getString(R.string.Q1_wrong);
        /*
         * Question 2 - Correct Answer is Bonding
         * Credit - Found code examples here:
         * https://stackoverflow.com/questions/4531396/get-value-of-a-edit-text-field
         * https://stackoverflow.com/questions/4396376/how-to-get-edittext-value-and-display-it-on-screen-through-textview/4396400
         * https://stackoverflow.com/questions/32279526/how-to-validate-string-as-user-input-from-keyboard-and-display-correct-answer
         */
        EditText editTextQ2answer = findViewById(R.id.question2answer);
        String stringQ2Answer = editTextQ2answer.getText().toString();
        String correct2Answer = getString(R.string.Q2_correct);
        if (stringQ2Answer.equals(correct2Answer)) {
            points++;
        }
        else
            wrongAnswer += getString(R.string.Q2_wrong);
        /*
         * Question 3 - Correct Answer is Radio Button 4 - 10-12 years
         */
        RadioButton radioButtonQ3d = findViewById(R.id.radio3d);
        if (radioButtonQ3d.isChecked()) {
            points++;
        }
        else
            wrongAnswer += getString(R.string.Q3_wrong);
        /*
         * Question 4 - Correct Answer is to Select All Checkboxes
         * Credit - found examples of code here:
         * https://stackoverflow.com/questions/43332666/check-only-2-of-4-checkbox
         */
        CheckBox checkBoxQ4a = findViewById(R.id.checkbox4a);
        CheckBox checkBoxQ4b = findViewById(R.id.checkbox4b);
        CheckBox checkBoxQ4c = findViewById(R.id.checkbox4c);
        CheckBox checkBoxQ4d = findViewById(R.id.checkbox4d);
        if (checkBoxQ4a.isChecked() && checkBoxQ4b.isChecked() &&
                checkBoxQ4c.isChecked() && checkBoxQ4d.isChecked()) {
            points++;
        }
        else
            wrongAnswer += getString(R.string.Q4_wrong);
        /*
         * Question 5 - Correct Answer is Radio Button 1 - True
         */
        RadioButton radioButtonQ5a = findViewById(R.id.radio5a);
        if (radioButtonQ5a.isChecked()) {
            points++;
        }
        else
            wrongAnswer += getString(R.string.Q5_wrong);
        /*
         * Question 6 - Correct Answer is Radio Button 1 - Cecotropes
         */
        RadioButton radioButtonQ6a = findViewById(R.id.radio6a);
        if (radioButtonQ6a.isChecked()) {
            points++;
        }
        else
            wrongAnswer += getString(R.string.Q6_wrong);
        /*
         * Question 7 - Correct Answer is Holland Lop
         */
        EditText editTextQ7answer = findViewById(R.id.question7answer);
        String stringQ7Answer = editTextQ7answer.getText().toString();
        String correct7Answer = getString(R.string.Q7_correct);
        if (stringQ7Answer.equals(correct7Answer)) {
            points++;
        }
        else
            wrongAnswer += getString(R.string.Q7_wrong);
        /*
         * Question 8 - Correct Answer is Radio Button 2 - Hay
         */
        RadioButton radioButtonQ8b = findViewById(R.id.radio8b);
        if (radioButtonQ8b.isChecked()) {
            points++;
        }
        else
            wrongAnswer += getString(R.string.Q8_wrong);
        /*
         * Question 9 - Correct Answer is Radio Button 1 - True
         */
        RadioButton radioButtonQ9a = findViewById(R.id.radio9a);
        if (radioButtonQ9a.isChecked()) {
            points++;
        }
        else
            wrongAnswer += getString(R.string.Q9_wrong);
        /*
         * Question 10 - Correct Answer is Radio Button 4 - Rabbits have 2 sets of incisors with peg teeth behind it
         */
        RadioButton radioButtonQ10d = findViewById(R.id.radio10d);
        if (radioButtonQ10d.isChecked()) {
            points++;
        }
        else
            wrongAnswer += getString(R.string.Q10_wrong);

        /*
         * Show Final Score in Toast
         * For finalScore - mentor suggested doing it like this instead of concatenating strings
         * https://discussions.udacity.com/t/share-your-project-mentor-feedback/508399/5714
         */
        String finalScore = getString(R.string.your_Score, points, wrongAnswer);
        Toast.makeText(this, finalScore, Toast.LENGTH_LONG).show();
    }

}
