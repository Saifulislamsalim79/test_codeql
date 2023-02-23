package com.smartlook.sdk.smartlook.integration.model;

import kotlin.Metadata;
import kotlin.e0.d.g;
@Metadata(m10423bv = {1, 0, 3}, m10422d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b&\u0018\u0000 \u000b:\u0001\fB\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0002\u001a\u00020\u0001H&¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0004\u001a\u00020\u0001H&¢\u0006\u0004\b\u0004\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0001¢\u0006\u0004\b\b\u0010\u0003¨\u0006\r"}, m10421d2 = {"Lcom/smartlook/sdk/smartlook/integration/model/Integration;", "", "name", "()Ljava/lang/String;", "printName", "", "instanceHashCode", "()I", "hash", "<init>", "()V", "Companion", "a", "smartlooksdk_nativeappRelease"}, k = 1, m10420mv = {1, 1, 15}, pn = "", xi = 0, m10419xs = "")
/* loaded from: classes2.dex */
public abstract class Integration {
    public static final C7257a Companion = new C7257a(null);
    public static final int STATIC_INSTANCE_HASH = 1;

    @Metadata(m10423bv = {1, 0, 3}, m10422d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u0000B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0002\u001a\u00020\u00018\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m10421d2 = {"com/smartlook/sdk/smartlook/integration/model/Integration$a", "", "STATIC_INSTANCE_HASH", "I", "<init>", "()V", "smartlooksdk_nativeappRelease"}, k = 1, m10420mv = {1, 1, 15}, pn = "", xi = 0, m10419xs = "")
    /* renamed from: com.smartlook.sdk.smartlook.integration.model.Integration$a */
    /* loaded from: classes2.dex */
    public static final class C7257a {
        private C7257a() {
        }

        public /* synthetic */ C7257a(g gVar) {
            this();
        }
    }

    public final String hash() {
        return name() + '_' + instanceHashCode();
    }

    public abstract int instanceHashCode();

    public abstract String name();

    public abstract String printName();
}
