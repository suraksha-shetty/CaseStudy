package com.target.folderhealth.monitor.impl;

public class MonitorProcess {

	private String secured;
	private long maxFileSize;
	private String archive;

	public MonitorProcess(String secured) {
		this.secured = secured;
	}

	public MonitorProcess withMaxSizeMB(long maxFileSize) {
		this.maxFileSize = maxFileSize;
		return this;
	}

	public MonitorProcess withArchiveDirName(String archive) {
		this.archive = archive;
		return this;
	}

	public String getSecuredFolderName() {
		return secured;
	}

	public long getMaxFileSize() {
		return maxFileSize;
	}

	public String getArchiveFolderName() {
		return archive;
	}

	public DirectoryOperations getDirectoryDetails() {
		return DirectoryOperations.getAllFilesInDirectoryRecursively(this.secured);
	}

}
