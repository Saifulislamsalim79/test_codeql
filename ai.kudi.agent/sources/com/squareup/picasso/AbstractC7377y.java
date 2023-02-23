package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.NetworkInfo;
import com.squareup.picasso.C7360t;
import java.io.IOException;
import p576m.InterfaceC14365s;
/* compiled from: RequestHandler.java */
/* renamed from: com.squareup.picasso.y */
/* loaded from: classes2.dex */
public abstract class AbstractC7377y {

    /* compiled from: RequestHandler.java */
    /* renamed from: com.squareup.picasso.y$a */
    /* loaded from: classes2.dex */
    public static final class C7378a {

        /* renamed from: a */
        private final C7360t.EnumC7366e f17529a;

        /* renamed from: b */
        private final Bitmap f17530b;

        /* renamed from: c */
        private final InterfaceC14365s f17531c;

        /* renamed from: d */
        private final int f17532d;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public C7378a(Bitmap bitmap, C7360t.EnumC7366e enumC7366e) {
            this(bitmap, null, enumC7366e, 0);
            C7332d0.m18953d(bitmap, "bitmap == null");
        }

        /* renamed from: a */
        public Bitmap m18834a() {
            return this.f17530b;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public int m18833b() {
            return this.f17532d;
        }

        /* renamed from: c */
        public C7360t.EnumC7366e m18832c() {
            return this.f17529a;
        }

        /* renamed from: d */
        public InterfaceC14365s m18831d() {
            return this.f17531c;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public C7378a(InterfaceC14365s interfaceC14365s, C7360t.EnumC7366e enumC7366e) {
            this(null, interfaceC14365s, enumC7366e, 0);
            C7332d0.m18953d(interfaceC14365s, "source == null");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public C7378a(Bitmap bitmap, InterfaceC14365s interfaceC14365s, C7360t.EnumC7366e enumC7366e, int i) {
            if ((bitmap != null) != (interfaceC14365s != null)) {
                this.f17530b = bitmap;
                this.f17531c = interfaceC14365s;
                C7332d0.m18953d(enumC7366e, "loadedFrom == null");
                this.f17529a = enumC7366e;
                this.f17532d = i;
                return;
            }
            throw new AssertionError();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m18841a(int i, int i2, int i3, int i4, BitmapFactory.Options options, C7373w c7373w) {
        int min;
        double floor;
        if (i4 > i2 || i3 > i) {
            if (i2 == 0) {
                floor = Math.floor(i3 / i);
            } else if (i == 0) {
                floor = Math.floor(i4 / i2);
            } else {
                int floor2 = (int) Math.floor(i4 / i2);
                int floor3 = (int) Math.floor(i3 / i);
                if (c7373w.f17490l) {
                    min = Math.max(floor2, floor3);
                } else {
                    min = Math.min(floor2, floor3);
                }
            }
            min = (int) floor;
        } else {
            min = 1;
        }
        options.inSampleSize = min;
        options.inJustDecodeBounds = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static void m18840b(int i, int i2, BitmapFactory.Options options, C7373w c7373w) {
        m18841a(i, i2, options.outWidth, options.outHeight, options, c7373w);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static BitmapFactory.Options m18839d(C7373w c7373w) {
        boolean m18861c = c7373w.m18861c();
        boolean z = c7373w.f17497s != null;
        BitmapFactory.Options options = null;
        if (m18861c || z || c7373w.f17496r) {
            options = new BitmapFactory.Options();
            options.inJustDecodeBounds = m18861c;
            boolean z2 = c7373w.f17496r;
            options.inInputShareable = z2;
            options.inPurgeable = z2;
            if (z) {
                options.inPreferredConfig = c7373w.f17497s;
            }
        }
        return options;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static boolean m18837g(BitmapFactory.Options options) {
        return options != null && options.inJustDecodeBounds;
    }

    /* renamed from: c */
    public abstract boolean mo18830c(C7373w c7373w);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo18838e() {
        return 0;
    }

    /* renamed from: f */
    public abstract C7378a mo18829f(C7373w c7373w, int i) throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo18836h(boolean z, NetworkInfo networkInfo) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo18835i() {
        return false;
    }
}
