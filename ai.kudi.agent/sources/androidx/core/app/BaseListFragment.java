package androidx.core.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.AbstractC1565i;
import androidx.lifecycle.C1578q;
import androidx.lifecycle.FragmentC1539a0;
import androidx.lifecycle.PreferenceActivity;
import androidx.lifecycle.Priority;
import p201g.p218e.C7534g;
import p201g.p227h.p238l.C7695f;
import p201g.p227h.p238l.SwipeRefreshLayout$OnRefreshListener;
/* compiled from: ComponentActivity.java */
/* loaded from: classes.dex */
public class BaseListFragment extends Activity implements PreferenceActivity, SwipeRefreshLayout$OnRefreshListener {
    private C7534g<Class<? extends g$a>, g$a> mExtraDataMap;
    private C1578q mLifecycleRegistry;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public BaseListFragment() {
        C7534g $r1 = new C7534g();
        this.mExtraDataMap = $r1;
        C1578q $r2 = new C1578q(this);
        this.mLifecycleRegistry = $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        Window $r2 = getWindow();
        View $r3 = $r2.getDecorView();
        if ($r3 != null) {
            boolean $z0 = C7695f.m17799d($r3, keyEvent);
            if ($z0) {
                return true;
            }
        }
        boolean $z02 = C7695f.e(this, $r3, this, keyEvent);
        return $z02;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        Window $r2 = getWindow();
        View $r3 = $r2.getDecorView();
        if ($r3 != null) {
            boolean $z0 = C7695f.m17799d($r3, keyEvent);
            if ($z0) {
                return true;
            }
        }
        boolean $z02 = super.dispatchKeyShortcutEvent(keyEvent);
        return $z02;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public g$a getExtraData(Class cls) {
        C7534g $r1 = this.mExtraDataMap;
        Object $r2 = $r1.get(cls);
        g$a $r4 = (g$a) $r2;
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public AbstractC1565i getLifecycle() {
        C1578q r1 = this.mLifecycleRegistry;
        return r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentC1539a0.m35561g(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        C1578q $r2 = this.mLifecycleRegistry;
        Priority $r3 = Priority.f4721I;
        $r2.j($r3);
        super.onSaveInstanceState(bundle);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed */
    public void putExtraData(g$a g_a) {
        C7534g $r2 = this.mExtraDataMap;
        Class $r3 = g_a.getClass();
        $r2.put($r3, g_a);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p201g.p227h.p238l.SwipeRefreshLayout$OnRefreshListener
    public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        boolean $z0 = super.dispatchKeyEvent(keyEvent);
        return $z0;
    }
}
