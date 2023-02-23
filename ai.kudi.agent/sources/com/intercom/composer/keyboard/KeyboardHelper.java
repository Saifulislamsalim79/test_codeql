package com.intercom.composer.keyboard;

import android.app.Activity;
import android.view.View;
import android.view.Window;
/* loaded from: classes2.dex */
public class KeyboardHelper implements OnKeyboardVisibilityListener {
    private final View behindKeyboardView;
    private final View editText;
    private final KeyboardManager keyboardManager;
    private final OrientationProvider orientationProvider;
    private final Window window;

    public KeyboardHelper(Activity activity, OrientationProvider orientationProvider, View view, View view2) {
        this(new KeyboardManager(activity, orientationProvider), orientationProvider, activity.getWindow(), view, view2);
    }

    private boolean isBehindKeyboardViewVisible() {
        return this.behindKeyboardView.getLayoutParams().height != 0;
    }

    public boolean hideBehindKeyboardView() {
        if (isBehindKeyboardViewVisible()) {
            this.behindKeyboardView.getLayoutParams().height = 0;
            this.behindKeyboardView.requestLayout();
            this.window.setSoftInputMode(16);
            return true;
        }
        return false;
    }

    public void onDestroy() {
        this.keyboardManager.removeGlobalLayoutListener();
    }

    @Override // com.intercom.composer.keyboard.OnKeyboardVisibilityListener
    public void onKeyboardVisibilityChanged(boolean z, int i) {
        if (z) {
            this.window.setSoftInputMode(16);
            if (isBehindKeyboardViewVisible()) {
                this.behindKeyboardView.getLayoutParams().height = 0;
                this.behindKeyboardView.requestLayout();
            }
        } else if (isBehindKeyboardViewVisible()) {
            this.window.setSoftInputMode(32);
        } else {
            this.window.setSoftInputMode(16);
        }
    }

    public void showBehindKeyboardView() {
        int orientation = this.orientationProvider.getOrientation();
        if (this.keyboardManager.isShowingKeyboard()) {
            this.behindKeyboardView.getLayoutParams().height = this.keyboardManager.getKeyboardHeight(orientation);
            this.behindKeyboardView.requestLayout();
            this.window.setSoftInputMode(32);
            if (this.keyboardManager.isShowingKeyboard()) {
                this.keyboardManager.hideSoftInput(this.editText);
            }
        } else if (isBehindKeyboardViewVisible()) {
        } else {
            this.behindKeyboardView.getLayoutParams().height = this.keyboardManager.getKeyboardHeight(orientation);
            this.behindKeyboardView.requestLayout();
            this.window.setSoftInputMode(32);
        }
    }

    KeyboardHelper(KeyboardManager keyboardManager, OrientationProvider orientationProvider, Window window, View view, View view2) {
        if (view2 == null) {
            throw new IllegalArgumentException("behindKeyboardView can not be null!");
        }
        if (view != null) {
            this.editText = view;
            this.behindKeyboardView = view2;
            this.window = window;
            window.setSoftInputMode(19);
            this.orientationProvider = orientationProvider;
            this.keyboardManager = keyboardManager;
            keyboardManager.setOnKeyboardVisibilityListener(this);
            return;
        }
        throw new IllegalArgumentException("editText can not be null!");
    }
}
