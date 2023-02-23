package com.google.android.flexbox;

import android.view.View;
import java.util.List;
/* compiled from: FlexContainer.java */
/* renamed from: com.google.android.flexbox.a */
/* loaded from: classes2.dex */
interface InterfaceC2687a {
    /* renamed from: b */
    void mo32242b(View view, int i, int i2, C2689c c2689c);

    /* renamed from: c */
    void mo32241c(C2689c c2689c);

    /* renamed from: d */
    View mo32240d(int i);

    /* renamed from: e */
    int mo32239e(int i, int i2, int i3);

    /* renamed from: f */
    void mo32238f(int i, View view);

    /* renamed from: g */
    View mo32237g(int i);

    int getAlignContent();

    int getAlignItems();

    int getFlexDirection();

    int getFlexItemCount();

    List<C2689c> getFlexLinesInternal();

    int getFlexWrap();

    int getLargestMainSize();

    int getMaxLine();

    int getPaddingBottom();

    int getPaddingEnd();

    int getPaddingLeft();

    int getPaddingRight();

    int getPaddingStart();

    int getPaddingTop();

    int getSumOfCrossSize();

    /* renamed from: h */
    int mo32236h(View view, int i, int i2);

    /* renamed from: i */
    int mo32235i(int i, int i2, int i3);

    /* renamed from: j */
    boolean mo32234j();

    /* renamed from: k */
    int mo32233k(View view);

    void setFlexLines(List<C2689c> list);
}
