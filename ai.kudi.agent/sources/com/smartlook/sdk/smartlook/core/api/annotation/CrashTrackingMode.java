package com.smartlook.sdk.smartlook.core.api.annotation;

import kotlin.Metadata;
import kotlin.e0.d.g;
@Metadata(m10423bv = {1, 0, 3}, m10422d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0001\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m10421d2 = {"Lcom/smartlook/sdk/smartlook/core/api/annotation/CrashTrackingMode;", "Ljava/lang/Enum;", "<init>", "(Ljava/lang/String;I)V", "Companion", "a", "FORCE", "DEFAULT", "DISABLE", "smartlooksdk_nativeappRelease"}, k = 1, m10420mv = {1, 1, 15}, pn = "", xi = 0, m10419xs = "")
/* loaded from: classes2.dex */
public enum CrashTrackingMode {
    FORCE,
    DEFAULT,
    DISABLE;
    
    public static final C7228a Companion = new C7228a(null);

    @Metadata(m10423bv = {1, 0, 3}, m10422d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u0000B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, m10421d2 = {"com/smartlook/sdk/smartlook/core/api/annotation/CrashTrackingMode$a", "", "ordinal", "Lcom/smartlook/sdk/smartlook/core/api/annotation/CrashTrackingMode;", "a", "(I)Lcom/smartlook/sdk/smartlook/core/api/annotation/CrashTrackingMode;", "<init>", "()V", "smartlooksdk_nativeappRelease"}, k = 1, m10420mv = {1, 1, 15}, pn = "", xi = 0, m10419xs = "")
    /* renamed from: com.smartlook.sdk.smartlook.core.api.annotation.CrashTrackingMode$a */
    /* loaded from: classes2.dex */
    public static final class C7228a {
        private C7228a() {
        }

        /* renamed from: a */
        public final CrashTrackingMode m19096a(int i) {
            if (i != 0) {
                if (i != 2) {
                    return CrashTrackingMode.DEFAULT;
                }
                return CrashTrackingMode.DISABLE;
            }
            return CrashTrackingMode.FORCE;
        }

        public /* synthetic */ C7228a(g gVar) {
            this();
        }
    }
}
