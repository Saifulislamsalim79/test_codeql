package com.squareup.picasso;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.provider.MediaStore;
import com.squareup.picasso.AbstractC7377y;
import com.squareup.picasso.C7360t;
import java.io.IOException;
import p576m.C14353l;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MediaStoreRequestHandler.java */
/* renamed from: com.squareup.picasso.o */
/* loaded from: classes2.dex */
public class C7352o extends C7338g {

    /* renamed from: b */
    private static final String[] f17407b = {"orientation"};

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MediaStoreRequestHandler.java */
    /* renamed from: com.squareup.picasso.o$a */
    /* loaded from: classes2.dex */
    public enum EnumC7353a {
        MICRO(3, 96, 96),
        MINI(1, IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED, 384),
        FULL(2, -1, -1);
        

        /* renamed from: c */
        final int f17412c;

        /* renamed from: d */
        final int f17413d;

        /* renamed from: e */
        final int f17414e;

        EnumC7353a(int i, int i2, int i3) {
            this.f17412c = i;
            this.f17413d = i2;
            this.f17414e = i3;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7352o(Context context) {
        super(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0022, code lost:
        r1.close();
     */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static int m18896k(android.content.ContentResolver r8, android.net.Uri r9) {
        /*
            r0 = 0
            r1 = 0
            java.lang.String[] r4 = com.squareup.picasso.C7352o.f17407b     // Catch: java.lang.Throwable -> L26 java.lang.RuntimeException -> L2d
            r5 = 0
            r6 = 0
            r7 = 0
            r2 = r8
            r3 = r9
            android.database.Cursor r1 = r2.query(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L26 java.lang.RuntimeException -> L2d
            if (r1 == 0) goto L20
            boolean r8 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L26 java.lang.RuntimeException -> L2d
            if (r8 != 0) goto L16
            goto L20
        L16:
            int r8 = r1.getInt(r0)     // Catch: java.lang.Throwable -> L26 java.lang.RuntimeException -> L2d
            if (r1 == 0) goto L1f
            r1.close()
        L1f:
            return r8
        L20:
            if (r1 == 0) goto L25
            r1.close()
        L25:
            return r0
        L26:
            r8 = move-exception
            if (r1 == 0) goto L2c
            r1.close()
        L2c:
            throw r8
        L2d:
            if (r1 == 0) goto L33
            r1.close()
        L33:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.C7352o.m18896k(android.content.ContentResolver, android.net.Uri):int");
    }

    /* renamed from: l */
    static EnumC7353a m18895l(int i, int i2) {
        EnumC7353a enumC7353a = EnumC7353a.MICRO;
        if (i > enumC7353a.f17413d || i2 > enumC7353a.f17414e) {
            EnumC7353a enumC7353a2 = EnumC7353a.MINI;
            return (i > enumC7353a2.f17413d || i2 > enumC7353a2.f17414e) ? EnumC7353a.FULL : enumC7353a2;
        }
        return enumC7353a;
    }

    @Override // com.squareup.picasso.C7338g, com.squareup.picasso.AbstractC7377y
    /* renamed from: c */
    public boolean mo18830c(C7373w c7373w) {
        Uri uri = c7373w.f17482d;
        return "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    @Override // com.squareup.picasso.C7338g, com.squareup.picasso.AbstractC7377y
    /* renamed from: f */
    public AbstractC7377y.C7378a mo18829f(C7373w c7373w, int i) throws IOException {
        Bitmap thumbnail;
        ContentResolver contentResolver = this.f17373a.getContentResolver();
        int m18896k = m18896k(contentResolver, c7373w.f17482d);
        String type = contentResolver.getType(c7373w.f17482d);
        boolean z = type != null && type.startsWith("video/");
        if (c7373w.m18861c()) {
            EnumC7353a m18895l = m18895l(c7373w.f17486h, c7373w.f17487i);
            if (!z && m18895l == EnumC7353a.FULL) {
                return new AbstractC7377y.C7378a(null, C14353l.m2014k(m18935j(c7373w)), C7360t.EnumC7366e.DISK, m18896k);
            }
            long parseId = ContentUris.parseId(c7373w.f17482d);
            BitmapFactory.Options m18839d = AbstractC7377y.m18839d(c7373w);
            m18839d.inJustDecodeBounds = true;
            AbstractC7377y.m18841a(c7373w.f17486h, c7373w.f17487i, m18895l.f17413d, m18895l.f17414e, m18839d, c7373w);
            if (z) {
                thumbnail = MediaStore.Video.Thumbnails.getThumbnail(contentResolver, parseId, m18895l == EnumC7353a.FULL ? 1 : m18895l.f17412c, m18839d);
            } else {
                thumbnail = MediaStore.Images.Thumbnails.getThumbnail(contentResolver, parseId, m18895l.f17412c, m18839d);
            }
            if (thumbnail != null) {
                return new AbstractC7377y.C7378a(thumbnail, null, C7360t.EnumC7366e.DISK, m18896k);
            }
        }
        return new AbstractC7377y.C7378a(null, C14353l.m2014k(m18935j(c7373w)), C7360t.EnumC7366e.DISK, m18896k);
    }
}
