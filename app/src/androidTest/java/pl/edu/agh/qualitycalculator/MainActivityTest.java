package pl.edu.agh.qualitycalculator;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.fail;

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityTestRule mActivityRule = new ActivityTestRule<>(
            MainActivity.class);



    @Test
    public void testAvg(){
        onView(withId(R.id.etNum1)).perform(click()).perform(typeText("8"));
        onView(withId(R.id.etNum2)).perform(click()).perform(typeText("2"));
        onView(withId(R.id.etNum3)).perform(click()).perform(typeText("2"));
        onView(withId(R.id.avgBttn)).perform(click());
        onView(withId(R.id.tvResult)).check(matches(withText("Average equals 4.0")));
    }

    @Test
    public void testSum(){
        onView(withId(R.id.etNum1)).perform(click()).perform(typeText("4"));
        onView(withId(R.id.etNum2)).perform(click()).perform(typeText("4"));
        onView(withId(R.id.btnAdd)).perform(click());
        onView(withId(R.id.tvResult)).check(matches(withText("4.0 plus 4.0 gives value 8.0")));
    }

    @Test
    public void testSubtract(){
        onView(withId(R.id.etNum1)).perform(click()).perform(typeText("12"));
        onView(withId(R.id.etNum2)).perform(click()).perform(typeText("11"));
        onView(withId(R.id.btnSub)).perform(click());
        onView(withId(R.id.tvResult)).check(matches(withText("12.0 minus 11.0 gives value 1.0")));
    }

    @Test
    public void testMultiply(){
        onView(withId(R.id.etNum1)).perform(click()).perform(typeText("2"));
        onView(withId(R.id.etNum2)).perform(click()).perform(typeText("3"));
        onView(withId(R.id.btnMult)).perform(click());
        onView(withId(R.id.tvResult)).check(matches(withText("2.0 multiplied by 3.0 gives value 6.0")));
    }

    @Test
    public void testDivide(){
        onView(withId(R.id.etNum1)).perform(click()).perform(typeText("6"));
        onView(withId(R.id.etNum2)).perform(click()).perform(typeText("2"));
        onView(withId(R.id.btnDiv)).perform(click());
        onView(withId(R.id.tvResult)).check(matches(withText("6.0 divided by 2.0 gives value 3.0")));
    }

    @Test
    public void testNoOperand(){
        onView(withId(R.id.etNum1)).perform(click()).perform(typeText("12"));
        onView(withId(R.id.btnAdd)).perform(click());
        onView(withId(R.id.tvResult)).check(matches(withText("No operand value")));
    }

    @Test
    public void testNoOperandAvg(){
        onView(withId(R.id.etNum1)).perform(click()).perform(typeText("12"));
        onView(withId(R.id.etNum2)).perform(click()).perform(typeText("12"));
        onView(withId(R.id.avgBttn)).perform(click());
        onView(withId(R.id.tvResult)).check(matches(withText("No operand value")));
    }

    @Test
    public void testDivideZero(){
        onView(withId(R.id.etNum1)).perform(click()).perform(typeText("6"));
        onView(withId(R.id.etNum2)).perform(click()).perform(typeText("0"));
        onView(withId(R.id.btnDiv)).perform(click());
        onView(withId(R.id.tvResult)).check(matches(withText("Error")));
    }

}

