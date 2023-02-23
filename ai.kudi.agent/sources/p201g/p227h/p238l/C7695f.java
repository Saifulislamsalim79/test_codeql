package p201g.p227h.p238l;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* compiled from: KeyEventDispatcher.java */
/* renamed from: g.h.l.f */
/* loaded from: classes2.dex */
public class C7695f {

    /* renamed from: a */
    private static boolean f18427a = false;

    /* renamed from: b */
    private static Method f18428b = null;

    /* renamed from: c */
    private static boolean f18429c = false;

    /* renamed from: d */
    private static Field f18430d;

    /* renamed from: a */
    private static boolean m17802a(ActionBar actionBar, KeyEvent keyEvent) {
        if (!f18427a) {
            try {
                f18428b = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
            } catch (NoSuchMethodException unused) {
            }
            f18427a = true;
        }
        Method method = f18428b;
        if (method != null) {
            try {
                return ((Boolean) method.invoke(actionBar, keyEvent)).booleanValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return false;
    }

    /* renamed from: b */
    private static boolean m17801b(Activity activity, KeyEvent keyEvent) {
        activity.onUserInteraction();
        Window window = activity.getWindow();
        if (window.hasFeature(8)) {
            ActionBar actionBar = activity.getActionBar();
            if (keyEvent.getKeyCode() == 82 && actionBar != null && m17802a(actionBar, keyEvent)) {
                return true;
            }
        }
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (C7759x.m17513i(decorView, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
    }

    /* renamed from: c */
    private static boolean m17800c(Dialog dialog, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener m17797f = m17797f(dialog);
        if (m17797f == null || !m17797f.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
            Window window = dialog.getWindow();
            if (window.superDispatchKeyEvent(keyEvent)) {
                return true;
            }
            View decorView = window.getDecorView();
            if (C7759x.m17513i(decorView, keyEvent)) {
                return true;
            }
            return keyEvent.dispatch(dialog, decorView != null ? decorView.getKeyDispatcherState() : null, dialog);
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m17799d(View view, KeyEvent keyEvent) {
        return C7759x.m17511j(view, keyEvent);
    }

    /* renamed from: e */
    public static boolean m17798e(a aVar, View view, Window.Callback callback, KeyEvent keyEvent) {
        if (aVar == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return aVar.superDispatchKeyEvent(keyEvent);
        }
        if (callback instanceof Activity) {
            return m17801b((Activity) callback, keyEvent);
        }
        if (callback instanceof Dialog) {
            return m17800c((Dialog) callback, keyEvent);
        }
        return (view != null && C7759x.m17513i(view, keyEvent)) || aVar.superDispatchKeyEvent(keyEvent);
    }

    /* renamed from: f */
    private static DialogInterface.OnKeyListener m17797f(Dialog dialog) {
        if (!f18429c) {
            try {
                Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                f18430d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f18429c = true;
        }
        Field field = f18430d;
        if (field != null) {
            try {
                return (DialogInterface.OnKeyListener) field.get(dialog);
            } catch (IllegalAccessException unused2) {
                return null;
            }
        }
        return null;
    }
}
