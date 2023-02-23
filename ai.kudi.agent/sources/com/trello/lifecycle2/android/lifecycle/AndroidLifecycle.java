package com.trello.lifecycle2.android.lifecycle;

import androidx.lifecycle.AbstractC1565i;
import androidx.lifecycle.PreferenceActivity;
import androidx.lifecycle.Scope;
import androidx.lifecycle.n;
import com.trello.rxlifecycle2.C7386c;
import com.trello.rxlifecycle2.FileStorage;
import com.trello.rxlifecycle2.b;
import p425j.p444e.p471k0.C11678a;
/* loaded from: classes.dex */
public final class AndroidLifecycle implements b<AbstractC1565i.b>, n {

    /* renamed from: o */
    private final C11678a<AbstractC1565i.b> f17534o;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private AndroidLifecycle(PreferenceActivity preferenceActivity) {
        C11678a $r2 = C11678a.m10575v0();
        this.f17534o = $r2;
        AbstractC1565i $r3 = preferenceActivity.getLifecycle();
        $r3.a(this);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FileStorage registerOnSharedPreferenceChangeListener(PreferenceActivity preferenceActivity) {
        AndroidLifecycle $r1 = new AndroidLifecycle(preferenceActivity);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public C7386c bindToLifecycle() {
        C11678a $r2 = this.f17534o;
        C7386c $r1 = C7380a.m18827a($r2);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    void onEvent(PreferenceActivity preferenceActivity, Scope scope) {
        C11678a $r4 = this.f17534o;
        $r4.mo331f(scope);
        Scope $r5 = Scope.ON_DESTROY;
        if (scope == $r5) {
            AbstractC1565i $r2 = preferenceActivity.getLifecycle();
            $r2.c(this);
        }
    }
}
