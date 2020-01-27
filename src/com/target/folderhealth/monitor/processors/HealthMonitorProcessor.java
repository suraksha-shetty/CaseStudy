package com.target.folderhealth.monitor.processors;

import com.target.folderhealth.monitor.impl.MonitorProcess;

public interface HealthMonitorProcessor {

	public HealthMonitorProcessResult process(MonitorProcess request);

}
