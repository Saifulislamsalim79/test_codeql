package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC3704a7;
import com.google.android.gms.internal.measurement.AbstractC4098z6;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.a7 */
/* loaded from: classes2.dex */
public abstract class AbstractC3704a7<MessageType extends AbstractC3704a7<MessageType, BuilderType>, BuilderType extends AbstractC4098z6<MessageType, BuilderType>> implements InterfaceC3927o9 {
    protected int zzb = 0;

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: h */
    public static <T> void m29846h(Iterable<T> iterable, List<? super T> list) {
        C4004t8.m28905e(iterable);
        if (iterable instanceof InterfaceC4068x8) {
            List<?> mo28659b = ((InterfaceC4068x8) iterable).mo28659b();
            InterfaceC4068x8 interfaceC4068x8 = (InterfaceC4068x8) list;
            int size = list.size();
            for (Object obj : mo28659b) {
                if (obj == null) {
                    int size2 = interfaceC4068x8.size();
                    StringBuilder sb = new StringBuilder(37);
                    sb.append("Element at index ");
                    sb.append(size2 - size);
                    sb.append(" is null.");
                    String sb2 = sb.toString();
                    int size3 = interfaceC4068x8.size();
                    while (true) {
                        size3--;
                        if (size3 < size) {
                            break;
                        }
                        interfaceC4068x8.remove(size3);
                    }
                    throw new NullPointerException(sb2);
                } else if (obj instanceof AbstractC3909n7) {
                    interfaceC4068x8.mo28657v((AbstractC3909n7) obj);
                } else {
                    interfaceC4068x8.add((String) obj);
                }
            }
        } else if (!(iterable instanceof InterfaceC4037v9)) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + iterable.size());
            }
            int size4 = list.size();
            for (T t : iterable) {
                if (t == 0) {
                    int size5 = list.size();
                    StringBuilder sb3 = new StringBuilder(37);
                    sb3.append("Element at index ");
                    sb3.append(size5 - size4);
                    sb3.append(" is null.");
                    String sb4 = sb3.toString();
                    int size6 = list.size();
                    while (true) {
                        size6--;
                        if (size6 < size4) {
                            break;
                        }
                        list.remove(size6);
                    }
                    throw new NullPointerException(sb4);
                }
                list.add(t);
            }
        } else {
            list.addAll(iterable);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3927o9
    /* renamed from: d */
    public final AbstractC3909n7 mo29247d() {
        try {
            int mo29249b = mo29249b();
            AbstractC3909n7 abstractC3909n7 = AbstractC3909n7.f9575d;
            byte[] bArr = new byte[mo29249b];
            AbstractC4019u7 m28872c = AbstractC4019u7.m28872c(bArr);
            mo29250a(m28872c);
            m28872c.m28871d();
            return new C3893m7(bArr);
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 72);
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ByteString threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public int mo29395g() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo29394i(int i) {
        throw null;
    }

    /* renamed from: j */
    public final byte[] m29845j() {
        try {
            byte[] bArr = new byte[mo29249b()];
            AbstractC4019u7 m28872c = AbstractC4019u7.m28872c(bArr);
            mo29250a(m28872c);
            m28872c.m28871d();
            return bArr;
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 72);
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a byte array threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }
}
