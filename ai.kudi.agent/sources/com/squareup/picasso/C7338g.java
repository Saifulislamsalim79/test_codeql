package com.squareup.picasso;

import android.content.Context;
import com.squareup.picasso.AbstractC7377y;
import com.squareup.picasso.C7360t;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import p576m.C14353l;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ContentStreamRequestHandler.java */
/* renamed from: com.squareup.picasso.g */
/* loaded from: classes2.dex */
public class C7338g extends AbstractC7377y {

    /* renamed from: a */
    final Context f17373a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7338g(Context context) {
        this.f17373a = context;
    }

    @Override // com.squareup.picasso.AbstractC7377y
    /* renamed from: c */
    public boolean mo18830c(C7373w c7373w) {
        return "content".equals(c7373w.f17482d.getScheme());
    }

    @Override // com.squareup.picasso.AbstractC7377y
    /* renamed from: f */
    public AbstractC7377y.C7378a mo18829f(C7373w c7373w, int i) throws IOException {
        return new AbstractC7377y.C7378a(C14353l.m2014k(m18935j(c7373w)), C7360t.EnumC7366e.DISK);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public InputStream m18935j(C7373w c7373w) throws FileNotFoundException {
        return this.f17373a.getContentResolver().openInputStream(c7373w.f17482d);
    }
}
