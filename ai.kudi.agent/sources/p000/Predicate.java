package p000;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;
import kotlinx.coroutines.android.AndroidDispatcherFactory;
import kotlinx.coroutines.android.AndroidExceptionPreHandler;
/* compiled from: ServiceLoader */
/* renamed from: Predicate */
/* loaded from: classes.dex */
public final /* synthetic */ class Predicate {
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static Iterator apply() {
        try {
            AndroidDispatcherFactory $r1 = new AndroidDispatcherFactory();
            Object[] $r0 = {$r1};
            List $r2 = Arrays.asList($r0);
            Iterator $r3 = $r2.iterator();
            return $r3;
        } catch (Throwable $r4) {
            String $r6 = $r4.getMessage();
            ServiceConfigurationError $r5 = new ServiceConfigurationError($r6, $r4);
            throw $r5;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static Iterator getColumns() {
        try {
            AndroidExceptionPreHandler $r1 = new AndroidExceptionPreHandler();
            Object[] $r0 = {$r1};
            List $r2 = Arrays.asList($r0);
            Iterator $r3 = $r2.iterator();
            return $r3;
        } catch (Throwable $r4) {
            String $r6 = $r4.getMessage();
            ServiceConfigurationError $r5 = new ServiceConfigurationError($r6, $r4);
            throw $r5;
        }
    }
}
