package androidx.room.p063z0;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.os.Build;
import android.os.CancellationSignal;
import androidx.room.AbstractC1802o0;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import p201g.p262t.p263a.InterfaceC8093g;
import p201g.p262t.p263a.InterfaceC8100j;
/* compiled from: DBUtil.java */
/* renamed from: androidx.room.z0.c */
/* loaded from: classes2.dex */
public class C1854c {
    /* renamed from: a */
    public static void m34420a(InterfaceC8093g interfaceC8093g) {
        ArrayList<String> arrayList = new ArrayList();
        Cursor mo16750j0 = interfaceC8093g.mo16750j0("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (mo16750j0.moveToNext()) {
            try {
                arrayList.add(mo16750j0.getString(0));
            } catch (Throwable th) {
                mo16750j0.close();
                throw th;
            }
        }
        mo16750j0.close();
        for (String str : arrayList) {
            if (str.startsWith("room_fts_content_sync_")) {
                interfaceC8093g.execSQL("DROP TRIGGER IF EXISTS " + str);
            }
        }
    }

    /* renamed from: b */
    public static Cursor m34419b(AbstractC1802o0 abstractC1802o0, InterfaceC8100j interfaceC8100j, boolean z, CancellationSignal cancellationSignal) {
        Cursor query = abstractC1802o0.query(interfaceC8100j, cancellationSignal);
        if (z && (query instanceof AbstractWindowedCursor)) {
            AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) query;
            int count = abstractWindowedCursor.getCount();
            return (Build.VERSION.SDK_INT < 23 || (abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count) ? C1853b.m34425a(abstractWindowedCursor) : query;
        }
        return query;
    }

    /* renamed from: c */
    public static int m34418c(File file) throws IOException {
        FileChannel fileChannel = null;
        try {
            ByteBuffer allocate = ByteBuffer.allocate(4);
            FileChannel channel = new FileInputStream(file).getChannel();
            channel.tryLock(60L, 4L, true);
            channel.position(60L);
            if (channel.read(allocate) == 4) {
                allocate.rewind();
                int i = allocate.getInt();
                if (channel != null) {
                    channel.close();
                }
                return i;
            }
            throw new IOException("Bad database header, unable to read 4 bytes at offset 60");
        } catch (Throwable th) {
            if (0 != 0) {
                fileChannel.close();
            }
            throw th;
        }
    }
}
