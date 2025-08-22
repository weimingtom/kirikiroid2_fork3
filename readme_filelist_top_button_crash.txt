	for (const std::string &path : paths) {
		CSBReader reader;
//		auto cell_ = reader.Load("ui/ListItem.csb"); //(cocos2d::Node *)
#if 0
		Widget *cell = dynamic_cast<Widget*>(reader.Load("ui/ListItem.csb"));
#else		
		Widget *cell = dynamic_cast<Widget*>(reader.Load("ui/ListItem.csb")->getChildByName("item"));
#endif	
		Button *item = dynamic_cast<Button*>(reader.findController("item"));
		item->setCallbackName(path);
		item->setTitleText(path);
		item->addClickEventListener(func);
		cells.emplace_back(cell);
		buttons.emplace_back(item);
	}

