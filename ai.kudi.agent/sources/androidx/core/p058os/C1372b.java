package androidx.core.p058os;

import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import java.io.Serializable;
import kotlin.C13287o;
import kotlin.e0.d.l;
/* compiled from: Bundle.kt */
/* renamed from: androidx.core.os.b */
/* loaded from: classes2.dex */
public final class C1372b {
    /* renamed from: a */
    public static final Bundle m36174a(C13287o<String, ? extends Object>... c13287oArr) {
        l.f(c13287oArr, "pairs");
        Bundle bundle = new Bundle(c13287oArr.length);
        int length = c13287oArr.length;
        int i = 0;
        while (i < length) {
            C13287o<String, ? extends Object> c13287o = c13287oArr[i];
            i++;
            String m5366a = c13287o.m5366a();
            Object m5365b = c13287o.m5365b();
            if (m5365b == null) {
                bundle.putString(m5366a, null);
            } else if (m5365b instanceof Boolean) {
                bundle.putBoolean(m5366a, ((Boolean) m5365b).booleanValue());
            } else if (m5365b instanceof Byte) {
                bundle.putByte(m5366a, ((Number) m5365b).byteValue());
            } else if (m5365b instanceof Character) {
                bundle.putChar(m5366a, ((Character) m5365b).charValue());
            } else if (m5365b instanceof Double) {
                bundle.putDouble(m5366a, ((Number) m5365b).doubleValue());
            } else if (m5365b instanceof Float) {
                bundle.putFloat(m5366a, ((Number) m5365b).floatValue());
            } else if (m5365b instanceof Integer) {
                bundle.putInt(m5366a, ((Number) m5365b).intValue());
            } else if (m5365b instanceof Long) {
                bundle.putLong(m5366a, ((Number) m5365b).longValue());
            } else if (m5365b instanceof Short) {
                bundle.putShort(m5366a, ((Number) m5365b).shortValue());
            } else if (m5365b instanceof Bundle) {
                bundle.putBundle(m5366a, (Bundle) m5365b);
            } else if (m5365b instanceof CharSequence) {
                bundle.putCharSequence(m5366a, (CharSequence) m5365b);
            } else if (m5365b instanceof Parcelable) {
                bundle.putParcelable(m5366a, (Parcelable) m5365b);
            } else if (m5365b instanceof boolean[]) {
                bundle.putBooleanArray(m5366a, (boolean[]) m5365b);
            } else if (m5365b instanceof byte[]) {
                bundle.putByteArray(m5366a, (byte[]) m5365b);
            } else if (m5365b instanceof char[]) {
                bundle.putCharArray(m5366a, (char[]) m5365b);
            } else if (m5365b instanceof double[]) {
                bundle.putDoubleArray(m5366a, (double[]) m5365b);
            } else if (m5365b instanceof float[]) {
                bundle.putFloatArray(m5366a, (float[]) m5365b);
            } else if (m5365b instanceof int[]) {
                bundle.putIntArray(m5366a, (int[]) m5365b);
            } else if (m5365b instanceof long[]) {
                bundle.putLongArray(m5366a, (long[]) m5365b);
            } else if (m5365b instanceof short[]) {
                bundle.putShortArray(m5366a, (short[]) m5365b);
            } else if (m5365b instanceof Object[]) {
                Class<?> componentType = m5365b.getClass().getComponentType();
                l.d(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    if (m5365b == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<android.os.Parcelable>");
                    }
                    bundle.putParcelableArray(m5366a, (Parcelable[]) m5365b);
                } else if (String.class.isAssignableFrom(componentType)) {
                    if (m5365b == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                    }
                    bundle.putStringArray(m5366a, (String[]) m5365b);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    if (m5365b == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.CharSequence>");
                    }
                    bundle.putCharSequenceArray(m5366a, (CharSequence[]) m5365b);
                } else if (Serializable.class.isAssignableFrom(componentType)) {
                    bundle.putSerializable(m5366a, (Serializable) m5365b);
                } else {
                    String canonicalName = componentType.getCanonicalName();
                    throw new IllegalArgumentException("Illegal value array type " + ((Object) canonicalName) + " for key \"" + m5366a + '\"');
                }
            } else if (m5365b instanceof Serializable) {
                bundle.putSerializable(m5366a, (Serializable) m5365b);
            } else if (Build.VERSION.SDK_INT >= 18 && (m5365b instanceof IBinder)) {
                bundle.putBinder(m5366a, (IBinder) m5365b);
            } else if (Build.VERSION.SDK_INT >= 21 && (m5365b instanceof Size)) {
                bundle.putSize(m5366a, (Size) m5365b);
            } else if (Build.VERSION.SDK_INT >= 21 && (m5365b instanceof SizeF)) {
                bundle.putSizeF(m5366a, (SizeF) m5365b);
            } else {
                String canonicalName2 = m5365b.getClass().getCanonicalName();
                throw new IllegalArgumentException("Illegal value type " + ((Object) canonicalName2) + " for key \"" + m5366a + '\"');
            }
        }
        return bundle;
    }
}
