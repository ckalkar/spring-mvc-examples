insert into ui_app values (1, 'vendor_management', 'Vendor Management');
insert into Ui_Form values(1, 'citizenship_rule_lookup', 1, 'Citizenship Rule Lookup', '', 'Rule', 1 );
insert into Ui_Form values(2, 'team_member', 2, 'Team Member', '', 'Form', 1 );
insert into Ui_Form values(3, 'country', 3, 'Country', '', 'Form', 1 );
insert into Ui_Form values(4, 'sow', 4, 'Sow', '', 'Form', 1 );
insert into Ui_Form values(5, 'project', 5, 'Project', '', 'Form', 1 );
insert into Ui_Form_Link values(5, 6, '', true);
insert into Ui_Form_Link values(5, 4, '', true);
insert into Ui_Form values(7, 'project_rule_lookup', 6, 'Project Rule Lookup', '', 'Rule', 1 );
insert into Ui_Form values(6, 'supplier', 7, 'Supplier', '', 'Form', 1 );
insert into Ui_Form_Link values(6, 8, 'location', true);
