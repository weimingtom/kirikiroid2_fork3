#if defined(__MINGW32__)	
printf("==================>TVPListDir,opendir>>>> %s\n", folder.c_str());
	//if ((dirp = opendir(folder.c_str()))) //mingw bug ? all windows bug ? not sure, need add "\\"
	if((dirp = opendir((folder + "\\").c_str()))) {
#else
	//if ((dirp = opendir(folder.c_str())))
	if((dirp = opendir((folder + "\\").c_str()))) {
#endif	


