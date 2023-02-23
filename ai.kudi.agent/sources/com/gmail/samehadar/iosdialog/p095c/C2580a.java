package com.gmail.samehadar.iosdialog.p095c;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import androidx.core.content.C1335a;
import com.gmail.samehadar.iosdialog.C2578a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: DialogUtils.java */
/* renamed from: com.gmail.samehadar.iosdialog.c.a */
/* loaded from: classes2.dex */
public class C2580a {

    /* renamed from: a */
    private static List<Drawable> f7212a;

    /* renamed from: a */
    public static AnimationDrawable m32585a(Context context) {
        return (AnimationDrawable) C1335a.m36322f(context, C2578a.spinner);
    }

    /* renamed from: b */
    public static AnimationDrawable m32584b(Context context, int i, int i2, boolean z) {
        if (f7212a == null) {
            f7212a = new ArrayList(12);
            Collections.addAll(f7212a, C1335a.m36322f(context, C2578a.spinner_0), C1335a.m36322f(context, C2578a.spinner_1), C1335a.m36322f(context, C2578a.spinner_2), C1335a.m36322f(context, C2578a.spinner_3), C1335a.m36322f(context, C2578a.spinner_4), C1335a.m36322f(context, C2578a.spinner_5), C1335a.m36322f(context, C2578a.spinner_6), C1335a.m36322f(context, C2578a.spinner_7), C1335a.m36322f(context, C2578a.spinner_8), C1335a.m36322f(context, C2578a.spinner_9), C1335a.m36322f(context, C2578a.spinner_10), C1335a.m36322f(context, C2578a.spinner_11));
        }
        AnimationDrawable animationDrawable = new AnimationDrawable();
        ArrayList<Drawable> arrayList = new ArrayList(12);
        for (Drawable drawable : f7212a) {
            Drawable mutate = drawable.getConstantState().newDrawable().mutate();
            mutate.setColorFilter(i, PorterDuff.Mode.MULTIPLY);
            arrayList.add(mutate);
        }
        if (!z) {
            Collections.reverse(arrayList);
        }
        for (Drawable drawable2 : arrayList) {
            animationDrawable.addFrame(drawable2, i2);
        }
        return animationDrawable;
    }
}
