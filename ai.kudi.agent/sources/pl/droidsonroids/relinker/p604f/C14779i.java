package pl.droidsonroids.relinker.p604f;

import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: ElfParser.java */
/* renamed from: pl.droidsonroids.relinker.f.i */
/* loaded from: classes3.dex */
public class C14779i implements Closeable {

    /* renamed from: c */
    private final FileChannel f33047c;

    public C14779i(File file) throws FileNotFoundException {
        if (file != null && file.exists()) {
            this.f33047c = new FileInputStream(file).getChannel();
            return;
        }
        throw new IllegalArgumentException("File is null or does not exist");
    }

    /* renamed from: c */
    private long m355c(AbstractC14774d abstractC14774d, long j, long j2) throws IOException {
        for (long j3 = 0; j3 < j; j3++) {
            AbstractC14775e mo363b = abstractC14774d.mo363b(j3);
            if (mo363b.f33040a == 1) {
                long j4 = mo363b.f33042c;
                if (j4 <= j2 && j2 <= mo363b.f33043d + j4) {
                    return (j2 - j4) + mo363b.f33041b;
                }
            }
        }
        throw new IllegalStateException("Could not map vma to file offset!");
    }

    /* renamed from: F */
    protected void m361F(ByteBuffer byteBuffer, long j, int i) throws IOException {
        byteBuffer.position(0);
        byteBuffer.limit(i);
        long j2 = 0;
        while (j2 < i) {
            int read = this.f33047c.read(byteBuffer, j + j2);
            if (read == -1) {
                throw new EOFException();
            }
            j2 += read;
        }
        byteBuffer.position(0);
    }

    /* renamed from: I */
    protected short m360I(ByteBuffer byteBuffer, long j) throws IOException {
        m361F(byteBuffer, j, 1);
        return (short) (byteBuffer.get() & 255);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: J */
    public int m359J(ByteBuffer byteBuffer, long j) throws IOException {
        m361F(byteBuffer, j, 2);
        return byteBuffer.getShort() & 65535;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: O */
    public long m358O(ByteBuffer byteBuffer, long j) throws IOException {
        m361F(byteBuffer, j, 8);
        return byteBuffer.getLong();
    }

    /* renamed from: P */
    protected String m357P(ByteBuffer byteBuffer, long j) throws IOException {
        StringBuilder sb = new StringBuilder();
        while (true) {
            long j2 = 1 + j;
            short m360I = m360I(byteBuffer, j);
            if (m360I != 0) {
                sb.append((char) m360I);
                j = j2;
            } else {
                return sb.toString();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: V */
    public long m356V(ByteBuffer byteBuffer, long j) throws IOException {
        m361F(byteBuffer, j, 4);
        return byteBuffer.getInt() & 4294967295L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f33047c.close();
    }

    /* renamed from: g */
    public AbstractC14774d m354g() throws IOException {
        this.f33047c.position(0L);
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        if (m356V(allocate, 0L) == 1179403647) {
            short m360I = m360I(allocate, 4L);
            boolean z = m360I(allocate, 5L) == 2;
            if (m360I == 1) {
                return new C14777g(z, this);
            }
            if (m360I == 2) {
                return new C14778h(z, this);
            }
            throw new IllegalStateException("Invalid class type!");
        }
        throw new IllegalArgumentException("Invalid ELF Magic!");
    }

    /* renamed from: m */
    public List<String> m353m() throws IOException {
        long j;
        this.f33047c.position(0L);
        ArrayList arrayList = new ArrayList();
        AbstractC14774d m354g = m354g();
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(m354g.f33034a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j2 = m354g.f33038e;
        int i = 0;
        if (j2 == 65535) {
            j2 = m354g.mo362c(0).f33044a;
        }
        long j3 = 0;
        while (true) {
            if (j3 >= j2) {
                j = 0;
                break;
            }
            AbstractC14775e mo363b = m354g.mo363b(j3);
            if (mo363b.f33040a == 2) {
                j = mo363b.f33041b;
                break;
            }
            j3++;
        }
        if (j == 0) {
            return Collections.unmodifiableList(arrayList);
        }
        ArrayList<Long> arrayList2 = new ArrayList();
        long j4 = 0;
        while (true) {
            AbstractC14773c mo364a = m354g.mo364a(j, i);
            long j5 = j;
            long j6 = mo364a.f33032a;
            if (j6 == 1) {
                arrayList2.add(Long.valueOf(mo364a.f33033b));
            } else if (j6 == 5) {
                j4 = mo364a.f33033b;
            }
            i++;
            if (mo364a.f33032a == 0) {
                break;
            }
            j = j5;
        }
        if (j4 != 0) {
            long m355c = m355c(m354g, j2, j4);
            for (Long l : arrayList2) {
                arrayList.add(m357P(allocate, l.longValue() + m355c));
            }
            return arrayList;
        }
        throw new IllegalStateException("String table offset not found!");
    }
}
