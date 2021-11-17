package com.adsys.dialog;

import android.app.AlertDialog;

/**
 * <h1>MyDialog</h1>
 * It shows a new {@link AlertDialog} in which you can take some
 * decisions with a different action for each.
 * <br><br>
 * <dl>
 *    <dt><b>Functions</b></dt>
 *    <dd> ➭ {@link #accept} </dd>
 *    <dd> ➭ {@link #decline}</dd>
 * </dl>
 */
public class MyDialog extends AlertDialog {
    private final MainActivity activity;

    protected MyDialog(MainActivity activity) {
        super(activity);
        this.activity = activity;

        setTitle("MyDialog says");
        setMessage("This is a dialog that you should accept");
        setButton(
                BUTTON_POSITIVE,
                "Ok let's try it",
                accept()
        );
        setButton(
                BUTTON_NEGATIVE,
                "Not this time...",
                decline()
        );
    }

    private OnClickListener accept() {
        return (dialogInterface, i) ->
                activity.getTextView().setText(R.string.button_accept);
    }

    private OnClickListener decline() {
        return (dialogInterface, i) ->
                activity.getTextView().setText(R.string.button_decline);
    }
}
