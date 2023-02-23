package com.google.android.play.core.assetpacks;

import com.google.android.play.core.internal.AbstractC4991p;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
/* renamed from: com.google.android.play.core.assetpacks.e0 */
/* loaded from: classes2.dex */
final class C4855e0 extends AbstractC4991p {

    /* renamed from: c */
    private final File f12287c;

    /* renamed from: d */
    private final File f12288d;

    /* renamed from: e */
    private final NavigableMap<Long, File> f12289e = new TreeMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4855e0(File file, File file2) throws IOException {
        this.f12287c = file;
        this.f12288d = file2;
        List<File> m26058a = C4901n2.m26058a(this.f12287c, this.f12288d);
        if (m26058a.isEmpty()) {
            throw new C4923t0(String.format("Virtualized slice archive empty for %s, %s", this.f12287c, this.f12288d));
        }
        int size = m26058a.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            File file3 = m26058a.get(i);
            this.f12289e.put(Long.valueOf(j), file3);
            j += file3.length();
        }
    }

    /* renamed from: F */
    private final InputStream m26126F(long j, Long l) throws IOException {
        FileInputStream fileInputStream = new FileInputStream((File) this.f12289e.get(l));
        if (fileInputStream.skip(j - l.longValue()) == j - l.longValue()) {
            return fileInputStream;
        }
        throw new C4923t0(String.format("Virtualized slice archive corrupt, could not skip in file with key %s", l));
    }

    @Override // com.google.android.play.core.internal.AbstractC4991p
    /* renamed from: c */
    public final long mo25887c() {
        Map.Entry<Long, File> lastEntry = this.f12289e.lastEntry();
        return lastEntry.getKey().longValue() + lastEntry.getValue().length();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.play.core.internal.AbstractC4991p
    /* renamed from: g */
    public final InputStream mo25886g(long j, long j2) throws IOException {
        if (j < 0 || j2 < 0) {
            throw new C4923t0(String.format("Invalid input parameters %s, %s", Long.valueOf(j), Long.valueOf(j2)));
        }
        long j3 = j + j2;
        if (j3 <= mo25887c()) {
            Long floorKey = this.f12289e.floorKey(Long.valueOf(j));
            Long floorKey2 = this.f12289e.floorKey(Long.valueOf(j3));
            if (floorKey.equals(floorKey2)) {
                return new C4850d0(m26126F(j, floorKey), j2);
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(m26126F(j, floorKey));
            Collection<File> values = this.f12289e.subMap(floorKey, false, floorKey2, false).values();
            if (!values.isEmpty()) {
                arrayList.add(new C4936w1(Collections.enumeration(values)));
            }
            arrayList.add(new C4850d0(new FileInputStream((File) this.f12289e.get(floorKey2)), j2 - (floorKey2.longValue() - j)));
            return new SequenceInputStream(Collections.enumeration(arrayList));
        }
        throw new C4923t0(String.format("Trying to access archive out of bounds. Archive ends at: %s. Tried accessing: %s", Long.valueOf(mo25887c()), Long.valueOf(j3)));
    }
}
