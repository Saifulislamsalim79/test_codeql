package p201g.p241i.p242a;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: ResourceCursorAdapter.java */
/* renamed from: g.i.a.c */
/* loaded from: classes2.dex */
public abstract class AbstractC7780c extends AbstractC7775a {

    /* renamed from: A */
    private int f18548A;

    /* renamed from: B */
    private int f18549B;

    /* renamed from: C */
    private LayoutInflater f18550C;

    @Deprecated
    public AbstractC7780c(Context context, int i, Cursor cursor, boolean z) {
        super(context, cursor, z);
        this.f18549B = i;
        this.f18548A = i;
        this.f18550C = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // p201g.p241i.p242a.AbstractC7775a
    /* renamed from: g */
    public View mo17426g(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f18550C.inflate(this.f18549B, viewGroup, false);
    }

    @Override // p201g.p241i.p242a.AbstractC7775a
    /* renamed from: h */
    public View mo17425h(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f18550C.inflate(this.f18548A, viewGroup, false);
    }
}
