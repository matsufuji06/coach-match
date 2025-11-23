-- 初期ユーザーデータを登録
INSERT INTO users (username, password, email) VALUES
('taro', '1234', 'taro@example.com'),
('admin', 'adminpass', 'admin@example.com'),
('secureuser', '$2a$10$7YFqfL/6hW.Jy7aPWB4SMeJcxT50XnMjVhrB9z5L2FArlCmRHV1Qa', 'secure@example.com');
