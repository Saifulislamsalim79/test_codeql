package com.squareup.picasso;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.squareup.picasso.AbstractC7377y;
import com.squareup.picasso.C7360t;
import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ResourceRequestHandler.java */
/* renamed from: com.squareup.picasso.z */
/* loaded from: classes2.dex */
public class C7379z extends AbstractC7377y {

    /* renamed from: a */
    private final Context f17533a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7379z(Context context) {
        this.f17533a = context;
    }

    /* renamed from: j */
    private static Bitmap m18828j(Resources resources, int i, C7373w c7373w) {
        BitmapFactory.Options m18839d = AbstractC7377y.m18839d(c7373w);
        if (AbstractC7377y.m18837g(m18839d)) {
            BitmapFactory.decodeResource(resources, i, m18839d);
            AbstractC7377y.m18840b(c7373w.f17486h, c7373w.f17487i, m18839d, c7373w);
        }
        return BitmapFactory.decodeResource(resources, i, m18839d);
    }

    @Override // com.squareup.picasso.AbstractC7377y
    /* renamed from: c */
    public boolean mo18830c(C7373w c7373w) {
        if (c7373w.f17483e != 0) {
            return true;
        }
        return "android.resource".equals(c7373w.f17482d.getScheme());
    }

    @Override // com.squareup.picasso.AbstractC7377y
    /* renamed from: f */
    public AbstractC7377y.C7378a mo18829f(C7373w c7373w, int i) throws IOException {
        Resources m18944m = C7332d0.m18944m(this.f17533a, c7373w);
        return new AbstractC7377y.C7378a(m18828j(m18944m, C7332d0.m18945l(m18944m, c7373w), c7373w), C7360t.EnumC7366e.DISK);
    }
}
