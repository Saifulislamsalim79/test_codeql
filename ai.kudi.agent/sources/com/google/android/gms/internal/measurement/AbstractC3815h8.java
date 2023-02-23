package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C4099z7;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.h8 */
/* loaded from: classes2.dex */
abstract class AbstractC3815h8<T extends C4099z7> {

    /* renamed from: a */
    private static final Logger f9385a = Logger.getLogger(AbstractC4019u7.class.getName());

    /* renamed from: b */
    private static final String f9386b = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";

    AbstractC3815h8() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static <T extends C4099z7> T m29555b(Class<T> cls) {
        String format;
        ClassLoader classLoader = AbstractC3815h8.class.getClassLoader();
        if (cls.equals(C4099z7.class)) {
            format = f9386b;
        } else if (cls.getPackage().equals(AbstractC3815h8.class.getPackage())) {
            format = String.format("%s.BlazeGenerated%sLoader", cls.getPackage().getName(), cls.getSimpleName());
        } else {
            throw new IllegalArgumentException(cls.getName());
        }
        try {
            try {
                try {
                    try {
                        return cls.cast(((AbstractC3815h8) Class.forName(format, true, classLoader).getConstructor(new Class[0]).newInstance(new Object[0])).m29556a());
                    } catch (IllegalAccessException e) {
                        throw new IllegalStateException(e);
                    }
                } catch (InvocationTargetException e2) {
                    throw new IllegalStateException(e2);
                }
            } catch (InstantiationException e3) {
                throw new IllegalStateException(e3);
            } catch (NoSuchMethodException e4) {
                throw new IllegalStateException(e4);
            }
        } catch (ClassNotFoundException unused) {
            Iterator it = ServiceLoader.load(AbstractC3815h8.class, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add(cls.cast(((AbstractC3815h8) it.next()).m29556a()));
                } catch (ServiceConfigurationError e5) {
                    Logger logger = f9385a;
                    Level level = Level.SEVERE;
                    String valueOf = String.valueOf(cls.getSimpleName());
                    logger.logp(level, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", valueOf.length() != 0 ? "Unable to load ".concat(valueOf) : new String("Unable to load "), (Throwable) e5);
                }
            }
            if (arrayList.size() == 1) {
                return (T) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (T) cls.getMethod("combine", Collection.class).invoke(null, arrayList);
            } catch (IllegalAccessException e6) {
                throw new IllegalStateException(e6);
            } catch (NoSuchMethodException e7) {
                throw new IllegalStateException(e7);
            } catch (InvocationTargetException e8) {
                throw new IllegalStateException(e8);
            }
        }
    }

    /* renamed from: a */
    protected abstract T m29556a();
}
