package com.squareup.picasso;

import android.content.Context;
import android.net.Uri;
import com.squareup.picasso.AbstractC7377y;
import com.squareup.picasso.C7360t;
import java.io.IOException;
import p201g.p246k.p247a.C7796a;
import p576m.C14353l;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FileRequestHandler.java */
/* renamed from: com.squareup.picasso.k */
/* loaded from: classes2.dex */
public class C7346k extends C7338g {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C7346k(Context context) {
        super(context);
    }

    /* renamed from: k */
    static int m18909k(Uri uri) throws IOException {
        return new C7796a(uri.getPath()).m17295e("Orientation", 1);
    }

    @Override // com.squareup.picasso.C7338g, com.squareup.picasso.AbstractC7377y
    /* renamed from: c */
    public boolean mo18830c(C7373w c7373w) {
        return "file".equals(c7373w.f17482d.getScheme());
    }

    @Override // com.squareup.picasso.C7338g, com.squareup.picasso.AbstractC7377y
    /* renamed from: f */
    public AbstractC7377y.C7378a mo18829f(C7373w c7373w, int i) throws IOException {
        return new AbstractC7377y.C7378a(null, C14353l.m2014k(m18935j(c7373w)), C7360t.EnumC7366e.DISK, m18909k(c7373w.f17482d));
    }
}
